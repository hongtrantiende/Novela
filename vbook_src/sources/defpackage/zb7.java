package defpackage;

import android.util.SparseArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zb7  reason: default package */
/* loaded from: classes.dex */
public final class zb7 {
    public final SparseArray a;
    public xsc b;

    public zb7(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(xsc xscVar, int i, int i2) {
        zb7 zb7Var;
        int a = xscVar.a(i);
        SparseArray sparseArray = this.a;
        if (sparseArray == null) {
            zb7Var = null;
        } else {
            zb7Var = (zb7) sparseArray.get(a);
        }
        if (zb7Var == null) {
            zb7Var = new zb7(1);
            sparseArray.put(xscVar.a(i), zb7Var);
        }
        if (i2 > i) {
            zb7Var.a(xscVar, i + 1, i2);
        } else {
            zb7Var.b = xscVar;
        }
    }
}
