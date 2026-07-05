package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fy2  reason: default package */
/* loaded from: classes.dex */
public final class fy2 extends jjc {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final SparseArray E;
    public final SparseBooleanArray F;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public fy2(gy2 gy2Var) {
        c(gy2Var);
        this.x = gy2Var.x;
        this.y = gy2Var.y;
        this.z = gy2Var.z;
        this.A = gy2Var.A;
        this.B = gy2Var.B;
        this.C = gy2Var.C;
        this.D = gy2Var.D;
        SparseArray sparseArray = gy2Var.E;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.E = sparseArray2;
        this.F = gy2Var.F.clone();
    }

    @Override // defpackage.jjc
    public final kjc a() {
        return new gy2(this);
    }

    @Override // defpackage.jjc
    public final jjc b(int i) {
        super.b(i);
        return this;
    }

    @Override // defpackage.jjc
    public final jjc d() {
        this.u = -3;
        return this;
    }

    @Override // defpackage.jjc
    public final jjc e(hjc hjcVar) {
        super.e(hjcVar);
        return this;
    }

    @Override // defpackage.jjc
    public final jjc f(String str) {
        super.f(str);
        return this;
    }

    @Override // defpackage.jjc
    public final jjc g(String[] strArr) {
        super.g(strArr);
        return this;
    }

    @Override // defpackage.jjc
    public final jjc h() {
        this.s = false;
        return this;
    }

    @Override // defpackage.jjc
    public final jjc i(int i, boolean z) {
        super.i(i, z);
        return this;
    }

    public final void j(Set set) {
        this.w.clear();
        this.w.addAll(set);
    }

    public fy2() {
        this.E = new SparseArray();
        this.F = new SparseBooleanArray();
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
    }
}
