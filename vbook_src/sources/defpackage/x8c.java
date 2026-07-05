package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x8c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class x8c implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x8c(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        long j;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("TileManager. loadTile. canceled. bitmap=");
                sb.append((Bitmap) obj3);
                sb.append(", ");
                sb.append((t7c) obj2);
                sb.append(". '");
                return rs8.h(((z8c) obj).b, sb, '\'');
            case 1:
                xt4 xt4Var = (xt4) obj2;
                vt4 vt4Var = (vt4) obj;
                if (((z86) obj3).e()) {
                    xt4Var.invoke(Boolean.FALSE);
                    vt4Var.invoke();
                } else {
                    xt4Var.invoke(Boolean.TRUE);
                }
                return pvcVar;
            case 2:
                cz7 cz7Var = (cz7) obj3;
                w43 w43Var = (w43) obj2;
                int i2 = w43Var.a;
                int i3 = w43Var.c;
                cp9 cp9Var = (cp9) ((aw7) obj).getValue();
                if (cp9Var != null) {
                    j = cp9Var.a;
                } else {
                    j = -1;
                }
                long j2 = j;
                cz7Var.getClass();
                cz7Var.a.c(new wp1(i2, i3, 0L, j2, (String) null, 20));
                return pvcVar;
            case 3:
                ((aw7) obj).setValue(Boolean.FALSE);
                ((xt4) obj3).invoke(((yk8) obj2).a);
                return pvcVar;
            case 4:
                ((aw7) obj).setValue(Boolean.FALSE);
                ((xt4) obj3).invoke(Integer.valueOf(((mbd) obj2).b));
                return pvcVar;
            case 5:
                z87.v((m82) obj3, null, null, new ik7((atd) obj2, (aw7) obj, null, 1), 3);
                return pvcVar;
            default:
                qi8 qi8Var = (qi8) obj3;
                xh8 xh8Var = (xh8) obj2;
                aw7 aw7Var = (aw7) obj;
                if (!qi8Var.b()) {
                    return null;
                }
                long j3 = xh8Var.a;
                return new tk8(qi8Var.a.h(), qi8Var.b.h(), qi8Var.c.h(), (int) (((zy5) aw7Var.getValue()).a >> 32), (int) (((zy5) aw7Var.getValue()).a & 4294967295L), (int) (qi8Var.a() >> 32), (int) (qi8Var.a() & 4294967295L), (int) (j3 >> 32), (int) (j3 & 4294967295L));
        }
    }
}
