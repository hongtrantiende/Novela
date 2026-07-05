package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f85  reason: default package */
/* loaded from: classes.dex */
public final class f85 extends fx9 {
    public final Map J;
    public zk3 K;

    public f85(ij1 ij1Var, fl3 fl3Var, cl3 cl3Var, Map map) {
        super(ij1Var, fl3Var, cl3Var);
        this.J = map;
    }

    @Override // defpackage.fx9
    public final vq4 q(vq4 vq4Var) {
        zk3 zk3Var;
        zk3 zk3Var2 = this.K;
        if (zk3Var2 == null) {
            zk3Var2 = vq4Var.s;
        }
        if (zk3Var2 != null && (zk3Var = (zk3) this.J.get(zk3Var2.c)) != null) {
            zk3Var2 = zk3Var;
        }
        tb7 tb7Var = vq4Var.l;
        tb7 tb7Var2 = null;
        if (tb7Var != null) {
            rb7[] rb7VarArr = tb7Var.a;
            int length = rb7VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    rb7 rb7Var = rb7VarArr[i];
                    if ((rb7Var instanceof g69) && "com.apple.streaming.transportStreamTimestamp".equals(((g69) rb7Var).b)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                if (length != 1) {
                    rb7[] rb7VarArr2 = new rb7[length - 1];
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 != i) {
                            rb7VarArr2[i2 < i ? i2 : i2 - 1] = rb7VarArr[i2];
                        }
                    }
                    tb7Var2 = new tb7(rb7VarArr2);
                }
            }
            if (zk3Var2 == vq4Var.s || tb7Var != vq4Var.l) {
                uq4 a = vq4Var.a();
                a.r = zk3Var2;
                a.k = tb7Var;
                vq4Var = new vq4(a);
            }
            return super.q(vq4Var);
        }
        tb7Var = tb7Var2;
        if (zk3Var2 == vq4Var.s) {
        }
        uq4 a2 = vq4Var.a();
        a2.r = zk3Var2;
        a2.k = tb7Var;
        vq4Var = new vq4(a2);
        return super.q(vq4Var);
    }
}
