package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: co9  reason: default package */
/* loaded from: classes.dex */
public final class co9 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public static final co9 b = new co9(1, 0);
    public static final co9 c = new co9(1, 1);
    public static final co9 d = new co9(1, 2);
    public static final co9 e = new co9(1, 3);
    public static final co9 f = new co9(1, 4);
    public static final co9 C = new co9(1, 5);
    public static final co9 D = new co9(1, 6);
    public static final co9 E = new co9(1, 7);
    public static final co9 F = new co9(1, 8);
    public static final co9 G = new co9(1, 9);
    public static final co9 H = new co9(1, 10);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co9(zl9 zl9Var) {
        super(1);
        this.a = 15;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = true;
        st3 st3Var = st3.b;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                long j = ((y78) obj).a;
                return pvcVar;
            case 1:
                ((af6) obj).getClass();
                return Boolean.TRUE;
            case 2:
                lw8 lw8Var = (lw8) obj;
                return pvcVar;
            case 3:
                return Integer.valueOf(((v1a) obj).b);
            case 4:
                return Integer.valueOf(((v1a) obj).c.b());
            case 5:
                if (((st3) obj) != st3Var) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (((st3) obj) != st3Var) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                List list = (List) obj;
                return pvcVar;
            case 8:
                int i2 = ((xr5) obj).a;
                return pvcVar;
            case 9:
                List list2 = (List) obj;
                return pvcVar;
            case 10:
                int i3 = ((xr5) obj).a;
                return pvcVar;
            case 11:
                return new zy5((((int) (((zy5) obj).a & 4294967295L)) & 4294967295L) | (0 << 32));
            case 12:
                return new zy5((((int) (((zy5) obj).a >> 32)) << 32) | (0 & 4294967295L));
            case 13:
                return new zy5((((int) (((zy5) obj).a & 4294967295L)) & 4294967295L) | (0 << 32));
            case 14:
                return new zy5((((int) (((zy5) obj).a >> 32)) << 32) | (0 & 4294967295L));
            case 15:
                ((fa5) obj).getClass();
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(((wy4) obj) instanceof o5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co9(int i, int i2) {
        super(i);
        this.a = i2;
    }
}
