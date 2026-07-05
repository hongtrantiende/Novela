package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uu9  reason: default package */
/* loaded from: classes.dex */
public abstract class uu9 {
    public static final su9 a;

    /* JADX WARN: Type inference failed for: r1v1, types: [v72, su9] */
    static {
        lt8 lt8Var = new lt8(50.0f);
        a = new v72(lt8Var, lt8Var, lt8Var, lt8Var);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [v72, su9] */
    public static final su9 a(float f) {
        sg3 sg3Var = new sg3(f);
        return new v72(sg3Var, sg3Var, sg3Var, sg3Var);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [v72, su9] */
    public static su9 b(int i) {
        float f;
        float f2;
        float f3;
        float f4 = 16.0f;
        if ((i & 1) != 0) {
            f = 0.0f;
        } else {
            f = 16.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        } else {
            f2 = 16.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        } else {
            f3 = 16.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new v72(new sg3(f), new sg3(f2), new sg3(f3), new sg3(f4));
    }
}
