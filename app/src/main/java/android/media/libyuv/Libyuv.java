package android.media.libyuv;

/**
 * 提供libyuv的封装
 */
public class Libyuv {

    // Used to load the 'libyuv' library on application startup.
    static {
        System.loadLibrary("yuv");
    }

    /**
     * 调用libyuv库转换ARGB为I420
     * @param src_argb              源ARGB数据
     * @param src_stride_argb       ARGB数据的步长
     * @param dst_y                 转换后的Y数据
     * @param dst_stride_y          转换后的Y数据的步长
     * @param dst_u                 转换后的U数据
     * @param dst_stride_u          转换后的U数据的步长
     * @param dst_v                 转换后的V数据
     * @param dst_stride_v          转换后V数据的步长
     * @param width                 图像的宽度
     * @param height                图像的高度
     * @return
     */
    public native int ARGBToI420(final byte[] src_argb,
                                 int src_stride_argb,
                                 byte[] dst_y,
                                 int dst_stride_y,
                                 byte[] dst_u,
                                 int dst_stride_u,
                                 byte[] dst_v,
                                 int dst_stride_v,
                                 int width,
                                 int height);

    /**
     * 对两张yuv图片进行alpha混合，结果为(1-a)*src0 + a*src1
     * @param src_y0                源图0的Y数据
     * @param src_stride_y0         源图0的Y数据的步长
     * @param src_u0                源图0的U数据
     * @param src_stride_u0         源图0的U数据的步长
     * @param src_v0                源图0的V数据
     * @param src_stride_v0         源图0的V数据的步长
     * @param src_y1                源图1的Y数据
     * @param src_stride_y1         源图1的Y数据的步长
     * @param src_u1                源图0的U数据
     * @param src_stride_u1         源图0的U数据的步长
     * @param src_v1                源图0的V数据
     * @param src_stride_v1         源图0的V数据的步长
     * @param alpha                 混合使用的alpha模板
     * @param alpha_stride          混合使用的alpha模板的步长
     * @param dst_y                 输出图像的Y数据
     * @param dst_stride_y          输出图像的Y数据的步长
     * @param dst_u                 输出图像的U数据
     * @param dst_stride_u          输出图像的U数据的步长
     * @param dst_v                 输出图像的V数据
     * @param dst_stride_v          输出图像的V数据的步长
     * @param width                 图像的宽度
     * @param height                图像的高度
     * @return
     */
    public native int I420Blend(final byte[] src_y0,
                                int src_stride_y0,
                                final byte[] src_u0,
                                int src_stride_u0,
                                final byte[] src_v0,
                                int src_stride_v0,
                                final byte[] src_y1,
                                int src_stride_y1,
                                final byte[] src_u1,
                                int src_stride_u1,
                                final byte[] src_v1,
                                int src_stride_v1,
                                final byte[] alpha,
                                int alpha_stride,
                                byte[] dst_y,
                                int dst_stride_y,
                                byte[] dst_u,
                                int dst_stride_u,
                                byte[] dst_v,
                                int dst_stride_v,
                                int width,
                                int height);
}