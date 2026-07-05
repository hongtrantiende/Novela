package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ng9  reason: default package */
/* loaded from: classes.dex */
public abstract class ng9 {
    public static final mg9 a;
    public static final mg9 b;

    static {
        Double valueOf = Double.valueOf(0.69d);
        Double valueOf2 = Double.valueOf(0.265d);
        Double valueOf3 = Double.valueOf(0.32d);
        Double valueOf4 = Double.valueOf(0.68d);
        Double valueOf5 = Double.valueOf(1.0d);
        gid gidVar = kl5.b;
        hq7 hq7Var = hq7.Q;
        fud fudVar = og9.a;
        fud fudVar2 = og9.b;
        fud fudVar3 = og9.c;
        a = new mg9("sRGB", gidVar, hq7Var, fudVar, fudVar2, fudVar3, new mx8(11));
        j55 j55Var = j55.G;
        b = og9.a("Linear sRGB", gidVar, j55Var, fudVar, fudVar2, fudVar3);
        gid gidVar2 = og9.d;
        og9.a("ACES2065-1", gidVar2, j55Var, og9.e, og9.f, og9.g);
        f fVar = f.a;
        fud fudVar4 = og9.h;
        fud fudVar5 = og9.i;
        fud fudVar6 = og9.j;
        og9.a("ACEScc", gidVar2, fVar, fudVar4, fudVar5, fudVar6);
        og9.a("ACEScct", gidVar2, g.a, fudVar4, fudVar5, fudVar6);
        og9.a("ACEScg", gidVar2, j55Var, fudVar4, fudVar5, fudVar6);
        jg9 jg9Var = new jg9(2.19921875d);
        Double valueOf6 = Double.valueOf(0.64d);
        Double valueOf7 = Double.valueOf(0.33d);
        fud fudVar7 = new fud(valueOf6, valueOf7);
        fud fudVar8 = new fud(Double.valueOf(0.21d), Double.valueOf(0.71d));
        Double valueOf8 = Double.valueOf(0.15d);
        Double valueOf9 = Double.valueOf(0.06d);
        og9.a("Adobe RGB", gidVar, jg9Var, fudVar7, fudVar8, new fud(valueOf8, valueOf9));
        int i = ue0.a;
        Double valueOf10 = Double.valueOf(0.708d);
        Double valueOf11 = Double.valueOf(0.292d);
        float floatValue = valueOf10.floatValue();
        float floatValue2 = valueOf11.floatValue();
        valueOf5.floatValue();
        Double valueOf12 = Double.valueOf(0.17d);
        Double valueOf13 = Double.valueOf(0.797d);
        float floatValue3 = valueOf12.floatValue();
        float floatValue4 = valueOf13.floatValue();
        valueOf5.floatValue();
        Double valueOf14 = Double.valueOf(0.131d);
        Double valueOf15 = Double.valueOf(0.046d);
        float floatValue5 = valueOf14.floatValue();
        float floatValue6 = valueOf15.floatValue();
        valueOf5.floatValue();
        tm1.a("RGB");
        float[] fArr = {floatValue, floatValue3, floatValue5, floatValue2, floatValue4, floatValue6, (1.0f - floatValue) - floatValue2, (1.0f - floatValue3) - floatValue4, (1.0f - floatValue5) - floatValue6};
        fud fudVar9 = gidVar.b;
        float[] w = nye.w(fArr);
        float f = fudVar9.a;
        float f2 = fudVar9.c;
        float f3 = (f * f2) / fudVar9.b;
        float a2 = fudVar9.a();
        nye.w(nye.s((w[2] * a2) + (w[1] * f2) + (w[0] * f3), (w[5] * a2) + (w[4] * f2) + (w[3] * f3), (w[8] * a2) + (w[7] * f2) + (w[6] * f3), fArr));
        og9.a("BT.709", gidVar, ve0.a, new fud(valueOf6, valueOf7), new fud(Double.valueOf(0.3d), Double.valueOf(0.6d)), new fud(valueOf8, valueOf9));
        og9.a("DCI P3", new gid("DCI P3", new fud(Double.valueOf(0.314d), Double.valueOf(0.351d))), new jg9(2.6d), new fud(valueOf4, valueOf3), new fud(valueOf2, valueOf), new fud(valueOf8, valueOf9));
        og9.a("Display P3", gidVar, hq7Var, new fud(valueOf4, valueOf3), new fud(valueOf2, valueOf), new fud(valueOf8, valueOf9));
        og9.a("ROMM RGB", kl5.a, kh5.V, new fud(Double.valueOf(0.7347d), Double.valueOf(0.2653d)), new fud(Double.valueOf(0.1596d), Double.valueOf(0.8404d)), new fud(Double.valueOf(0.0366d), Double.valueOf(1.0E-4d)));
    }
}
