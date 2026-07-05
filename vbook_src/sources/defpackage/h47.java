package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.HashMap;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h47  reason: default package */
/* loaded from: classes.dex */
public final class h47 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public h47(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = lc7.o(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(a2d.g(i, widthAlignment) * widthAlignment, a2d.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            double floor = Math.floor(d);
            if (videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
                Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
                if (achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    public static h47 i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z7;
        boolean z8;
        boolean z9;
        String str6;
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                z6 = true;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z7 = z;
                z8 = z2;
                z9 = z3;
                str4 = str2;
                return new h47(str6, str4, str5, codecCapabilities2, z7, z8, z9, z4, z5, z6);
            }
        }
        z6 = false;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z7 = z;
        z8 = z2;
        z9 = z3;
        str6 = str;
        return new h47(str6, str4, str5, codecCapabilities2, z7, z8, z9, z4, z5, z6);
    }

    public final er2 b(vq4 vq4Var, vq4 vq4Var2) {
        int i;
        vq4 vq4Var3;
        vq4 vq4Var4;
        int i2;
        int i3;
        String str = vq4Var.o;
        gm1 gm1Var = vq4Var.E;
        String str2 = vq4Var2.o;
        gm1 gm1Var2 = vq4Var2.E;
        boolean equals = Objects.equals(str, str2);
        boolean z = false;
        if (!equals) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.i) {
            if (vq4Var.A != vq4Var2.A) {
                i |= 1024;
            }
            z = (vq4Var.v == vq4Var2.v && vq4Var.w == vq4Var2.w) ? true : true;
            if (!this.e && z) {
                i |= 512;
            }
            if ((!gm1.e(gm1Var) || !gm1.e(gm1Var2)) && !Objects.equals(gm1Var, gm1Var2)) {
                i |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !vq4Var.b(vq4Var2)) {
                i |= 2;
            }
            int i4 = vq4Var.x;
            if (i4 != -1 && (i3 = vq4Var.y) != -1 && i4 == vq4Var2.x && i3 == vq4Var2.y && z) {
                i |= 2;
            }
            if (i == 0 && Objects.equals(vq4Var2.o, "video/dolby-vision")) {
                Pair b = vk1.b(vq4Var);
                Pair b2 = vk1.b(vq4Var2);
                if (b == null || b2 == null || !((Integer) b.first).equals(b2.first)) {
                    i |= 2;
                }
            }
            if (i == 0) {
                if (vq4Var.b(vq4Var2)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new er2(this.a, vq4Var, vq4Var2, i2, 0);
            }
            vq4Var3 = vq4Var;
            vq4Var4 = vq4Var2;
        } else {
            vq4Var3 = vq4Var;
            vq4Var4 = vq4Var2;
            if (vq4Var3.G != vq4Var4.G) {
                i |= 4096;
            }
            if (vq4Var3.H != vq4Var4.H) {
                i |= 8192;
            }
            if (vq4Var3.I != vq4Var4.I) {
                i |= 16384;
            }
            String str3 = this.b;
            if (i == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair b3 = vk1.b(vq4Var3);
                Pair b4 = vk1.b(vq4Var4);
                if (b3 != null && b4 != null) {
                    int intValue = ((Integer) b3.first).intValue();
                    int intValue2 = ((Integer) b4.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new er2(this.a, vq4Var3, vq4Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && b3.equals(b4)) {
                        return new er2(this.a, vq4Var3, vq4Var4, 3, 0);
                    }
                }
            }
            if (i == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new er2(this.a, vq4Var3, vq4Var4, 3, 0);
            }
            if (!vq4Var3.b(vq4Var4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i |= 2;
            }
            if (i == 0) {
                return new er2(this.a, vq4Var3, vq4Var4, 1, 0);
            }
        }
        return new er2(this.a, vq4Var3, vq4Var4, 0, i);
    }

    public final boolean c(Context context, vq4 vq4Var, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair b = vk1.b(vq4Var);
        String str = vq4Var.o;
        char c = 65535;
        String str2 = this.c;
        if (str != null && str.equals("video/mv-hevc")) {
            String p = lc7.p(str2);
            if (!p.equals("video/mv-hevc")) {
                if (p.equals("video/hevc")) {
                    HashMap hashMap = o47.a;
                    String o = dae.o(vq4Var.r);
                    if (o == null) {
                        b = null;
                    } else {
                        String trim = o.trim();
                        String str3 = a2d.a;
                        b = vk1.c(o, trim.split("\\.", -1), vq4Var.E);
                    }
                }
            }
            return true;
        }
        if (b != null) {
            int intValue = ((Integer) b.first).intValue();
            int intValue2 = ((Integer) b.second).intValue();
            boolean equals = "video/dolby-vision".equals(str);
            int i2 = 8;
            String str4 = this.b;
            if (equals) {
                str4.getClass();
                switch (str4.hashCode()) {
                    case -1662735862:
                        if (str4.equals("video/av01")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1662541442:
                        if (str4.equals("video/hevc")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1331836730:
                        if (str4.equals("video/avc")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                        intValue = 2;
                        intValue2 = 0;
                        break;
                    case 2:
                        intValue = 8;
                        intValue2 = 0;
                        break;
                }
            }
            if (this.i || str4.equals("audio/ac4") || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                    if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null) {
                        i = audioCapabilities.getMaxInputChannelCount();
                    } else {
                        i = 2;
                    }
                    if (i > 18) {
                        i2 = 16;
                    }
                    if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                        codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{o47.b(1026, i2)};
                    } else {
                        codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{o47.b(257, i2), o47.b(513, i2), o47.b(514, i2), o47.b(1026, i2), o47.b(1028, i2)};
                    }
                    codecProfileLevelArr = codecProfileLevelArr2;
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z)) {
                        if ("video/hevc".equals(str4) && 2 == intValue) {
                            String str5 = Build.DEVICE;
                            if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                            }
                        }
                    }
                }
                h("codec.profileLevel, " + vq4Var.k + ", " + str2);
                return false;
            }
        }
        return true;
    }

    public final boolean d(vq4 vq4Var) {
        if (Objects.equals(vq4Var.o, "audio/flac") && vq4Var.I == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) {
            return false;
        }
        return true;
    }

    public final boolean e(Context context, vq4 vq4Var) {
        int i;
        int i2;
        String str = vq4Var.o;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(o47.c(vq4Var))) || !c(context, vq4Var, true) || !d(vq4Var)) {
            return false;
        }
        if (this.i) {
            int i3 = vq4Var.v;
            if (i3 > 0 && (i2 = vq4Var.w) > 0) {
                return g(i3, i2, vq4Var.z);
            }
        } else {
            int i4 = vq4Var.H;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i4)) {
                    h("sampleRate.support, " + i4);
                    return false;
                }
            }
            int i5 = vq4Var.G;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i = 16;
                    } else {
                        i = 30;
                    }
                    StringBuilder s = s21.s("AssumedMaxChannelAdjustment: ", this.a, ", [", maxInputChannelCount, " to ");
                    s.append(i);
                    s.append("]");
                    st0.w("MediaCodecInfo", s.toString());
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    h("channelCount.support, " + i5);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(vq4 vq4Var) {
        if (this.i) {
            return this.e;
        }
        Pair b = vk1.b(vq4Var);
        if (b != null && ((Integer) b.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean g(int i, int i2, double d) {
        int i3;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            if (i4 >= 29 && ((bool = vye.h) == null || !bool.booleanValue())) {
                i3 = ff.b(videoCapabilities, i, i2, d);
            } else {
                i3 = 0;
            }
            if (i3 != 2) {
                if (i3 == 1) {
                    StringBuilder r = hl5.r(i, i2, "sizeAndRate.cover, ", "x", "@");
                    r.append(d);
                    h(r.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder r2 = hl5.r(i, i2, "sizeAndRate.rotated, ", "x", "@");
                    r2.append(d);
                    StringBuilder y = nk2.y("AssumedSupport [", r2.toString(), "] [", str, ", ");
                    y.append(this.b);
                    y.append("] [");
                    y.append(a2d.a);
                    y.append("]");
                    st0.g("MediaCodecInfo", y.toString());
                    return true;
                }
            }
            StringBuilder r3 = hl5.r(i, i2, "sizeAndRate.support, ", "x", "@");
            r3.append(d);
            h(r3.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder o = a82.o("NoSupport [", str, "] [");
        o.append(this.a);
        o.append(", ");
        o.append(this.b);
        o.append("] [");
        o.append(a2d.a);
        o.append("]");
        st0.g("MediaCodecInfo", o.toString());
    }

    public final String toString() {
        return this.a;
    }
}
