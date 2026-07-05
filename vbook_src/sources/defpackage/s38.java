package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s38  reason: default package */
/* loaded from: classes.dex */
public class s38 {
    public final gw7 a = new gw7(new z28[16], 0);
    public final kv7 b = new kv7(10);

    public boolean a(my6 my6Var, sc6 sc6Var, ejf ejfVar, boolean z) {
        gw7 gw7Var = this.a;
        Object[] objArr = gw7Var.a;
        int i = gw7Var.c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (!((z28) objArr[i2]).a(my6Var, sc6Var, ejfVar, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        return z2;
    }

    public void b(ejf ejfVar) {
        gw7 gw7Var = this.a;
        int i = gw7Var.c;
        while (true) {
            i--;
            if (-1 < i) {
                if (((z28) gw7Var.a[i]).d.b == 0) {
                    gw7Var.k(i);
                }
            } else {
                return;
            }
        }
    }
}
