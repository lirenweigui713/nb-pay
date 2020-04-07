package com.chl.common;

import com.chl.common.config.CommonConfig;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/4/7 12:02
 */
public class VideoProcess {

    //视频文件路径
    private static String videoPath = "D:\\迅雷下载\\Three.Kingdoms.Resurrection.of.the.Dragon.2008.BluRay.REMUX.1080p.AVC.DTS-HD.MA7.1-HDS\\BDMV\\STREAM";

    //视频帧图片存储路径
    public static String videoFramesPath = "D:\\images";

    /**
     * TODO 将视频文件帧处理并以“jpg”格式进行存储。
     * 依赖FrameToBufferedImage方法：将frame转换为bufferedImage对象
     *
     * @param videoFileName
     */
    public static void grabberVideoFramer(String videoFileName) {
        //Frame对象
        Frame frame = null;
        //标识
        int flag = 0;
        /*
            获取视频文件
         */
        FFmpegFrameGrabber fFmpegFrameGrabber = new FFmpegFrameGrabber(videoPath + "/" + videoFileName);

        try {
            fFmpegFrameGrabber.start();
            /*
            .getFrameRate()方法：获取视频文件信息,总帧数
             */
            int ftp = fFmpegFrameGrabber.getLengthInFrames();
//            System.out.println(fFmpegFrameGrabber.grabKeyFrame());
            System.out.println("时长 " + ftp / fFmpegFrameGrabber.getFrameRate() / 60);

            BufferedImage bImage = null;
            System.out.println("开始运行视频提取帧，耗时较长");

            while (flag <= ftp) {
                //文件绝对路径+名字
                String fileName = videoFramesPath + "/zl_" + String.valueOf(flag-1) + ".jpg";
                //文件储存对象
                File outPut = new File(fileName);
                //获取帧
                frame = fFmpegFrameGrabber.grabImage();
//                System.out.println(frame);
                if (frame != null) {
                    ImageIO.write(FrameToBufferedImage(frame), "jpg", outPut);
                }
                flag++;
            }
            System.out.println("============运行结束============");
            fFmpegFrameGrabber.stop();
        } catch (IOException E) {
        }
    }
    public static BufferedImage FrameToBufferedImage(Frame frame) {
        //创建BufferedImage对象
        Java2DFrameConverter converter = new Java2DFrameConverter();
        BufferedImage bufferedImage = converter.getBufferedImage(frame);
        return bufferedImage;
    }
    /*
        测试.....
     */
    public static void main(String[] args) {
        String videoFileName = "00000.m2ts";
        grabberVideoFramer(videoFileName);
    }
    public static String getVideoPath() {
        return videoPath;
    }
    public static void setVideoPath(String videoPath) {
        VideoProcess.videoPath = videoPath;
    }
}
