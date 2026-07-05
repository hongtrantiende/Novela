package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wm1  reason: default package */
/* loaded from: classes.dex */
public final class wm1 {
    public static final float[] a;
    public static final float[] b;
    public static final yjc c;
    public static final yjc d;
    public static final zs9 e;
    public static final zs9 f;
    public static final zs9 g;
    public static final zs9 h;
    public static final zs9 i;
    public static final zs9 j;
    public static final zs9 k;
    public static final zs9 l;
    public static final zs9 m;
    public static final zs9 n;
    public static final zs9 o;
    public static final zs9 p;
    public static final zs9 q;
    public static final zs9 r;
    public static final ya6 s;
    public static final ya6 t;
    public static final zs9 u;
    public static final zs9 v;
    public static final zs9 w;
    public static final p98 x;
    public static final sm1[] y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [sm1, p98] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        yjc yjcVar = new yjc(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        yjc yjcVar2 = new yjc(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        yjc yjcVar3 = new yjc(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = yjcVar3;
        yjc yjcVar4 = new yjc(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = yjcVar4;
        hid hidVar = dye.h;
        zs9 zs9Var = new zs9("sRGB IEC61966-2.1", fArr, hidVar, yjcVar, 0);
        e = zs9Var;
        zs9 zs9Var2 = new zs9("sRGB IEC61966-2.1 (Linear)", fArr, hidVar, 1.0d, nae.e, 1.0f, 1);
        f = zs9Var2;
        zs9 zs9Var3 = new zs9("scRGB-nl IEC 61966-2-2:2003", fArr, hidVar, null, new vs(28), new vs(29), -0.799f, 2.399f, yjcVar, 2);
        g = zs9Var3;
        zs9 zs9Var4 = new zs9("scRGB IEC 61966-2-2:2003", fArr, hidVar, 1.0d, -0.5f, 7.499f, 3);
        h = zs9Var4;
        zs9 zs9Var5 = new zs9("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, hidVar, new yjc(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = zs9Var5;
        zs9 zs9Var6 = new zs9("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, hidVar, new yjc(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = zs9Var6;
        zs9 zs9Var7 = new zs9("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new hid(0.314f, 0.351f), 2.6d, nae.e, 1.0f, 6);
        k = zs9Var7;
        zs9 zs9Var8 = new zs9("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, hidVar, yjcVar, 7);
        l = zs9Var8;
        zs9 zs9Var9 = new zs9("NTSC (1953)", fArr2, dye.e, new yjc(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = zs9Var9;
        zs9 zs9Var10 = new zs9("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, hidVar, new yjc(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = zs9Var10;
        zs9 zs9Var11 = new zs9("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, hidVar, 2.2d, nae.e, 1.0f, 10);
        o = zs9Var11;
        zs9 zs9Var12 = new zs9("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, dye.f, new yjc(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = zs9Var12;
        float[] fArr4 = {0.7347f, 0.2653f, nae.e, 1.0f, 1.0E-4f, -0.077f};
        hid hidVar2 = dye.g;
        zs9 zs9Var13 = new zs9("SMPTE ST 2065-1:2012 ACES", fArr4, hidVar2, 1.0d, -65504.0f, 65504.0f, 12);
        q = zs9Var13;
        zs9 zs9Var14 = new zs9("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, hidVar2, 1.0d, -65504.0f, 65504.0f, 13);
        r = zs9Var14;
        ya6 ya6Var = new ya6(14, 1, 12884901889L, "Generic XYZ");
        s = ya6Var;
        ya6 ya6Var2 = new ya6(15, 0, 12884901890L, "Generic L*a*b*");
        t = ya6Var2;
        zs9 zs9Var15 = new zs9("None", fArr, hidVar, yjcVar2, 16);
        u = zs9Var15;
        zs9 zs9Var16 = new zs9("Hybrid Log Gamma encoding", fArr3, hidVar, null, new vm1(0), new vm1(1), nae.e, 1.0f, yjcVar3, 17);
        v = zs9Var16;
        zs9 zs9Var17 = new zs9("Perceptual Quantizer encoding", fArr3, hidVar, null, new vm1(2), new vm1(3), nae.e, 1.0f, yjcVar4, 18);
        w = zs9Var17;
        ?? sm1Var = new sm1("Oklab", 12884901890L, 19);
        x = sm1Var;
        y = new sm1[]{zs9Var, zs9Var2, zs9Var3, zs9Var4, zs9Var5, zs9Var6, zs9Var7, zs9Var8, zs9Var9, zs9Var10, zs9Var11, zs9Var12, zs9Var13, zs9Var14, ya6Var, ya6Var2, zs9Var15, zs9Var16, zs9Var17, sm1Var};
    }

    public static double a(yjc yjcVar, double d2) {
        double d3;
        double exp;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = d2 * d3;
        double d5 = yjcVar.b;
        double d6 = yjcVar.c;
        double d7 = yjcVar.d;
        double d8 = yjcVar.e;
        double d9 = yjcVar.f;
        double d10 = yjcVar.g + 1.0d;
        double d11 = d5 * d4;
        if (d11 <= 1.0d) {
            exp = Math.pow(d11, d6);
        } else {
            exp = Math.exp((d4 - d9) * d7) + d8;
        }
        return d10 * d3 * exp;
    }

    public static double b(yjc yjcVar, double d2) {
        double d3;
        double log;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = 1.0d / yjcVar.b;
        double d5 = 1.0d / yjcVar.c;
        double d6 = 1.0d / yjcVar.d;
        double d7 = yjcVar.e;
        double d8 = yjcVar.f;
        double d9 = (d2 * d3) / (yjcVar.g + 1.0d);
        if (d9 <= 1.0d) {
            log = Math.pow(d9, d5) * d4;
        } else {
            log = (Math.log(d9 - d7) * d6) + d8;
        }
        return d3 * log;
    }

    public static double c(yjc yjcVar, double d2) {
        double d3;
        double d4 = 0.0d;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d5 = d2 * d3;
        double d6 = yjcVar.b;
        double d7 = yjcVar.d;
        double pow = (Math.pow(d5, d7) * yjcVar.c) + d6;
        if (pow >= 0.0d) {
            d4 = pow;
        }
        return Math.pow(d4 / ((Math.pow(d5, d7) * yjcVar.f) + yjcVar.e), yjcVar.g) * d3;
    }

    public static double d(yjc yjcVar, double d2) {
        double d3;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = d2 * d3;
        double d5 = yjcVar.e;
        double d6 = 1.0d / yjcVar.g;
        return Math.pow(Math.max((Math.pow(d4, d6) * d5) + (-yjcVar.b), 0.0d) / ((Math.pow(d4, d6) * (-yjcVar.f)) + yjcVar.c), 1.0d / yjcVar.d) * d3;
    }
}
