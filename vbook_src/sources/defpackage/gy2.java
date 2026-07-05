package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gy2  reason: default package */
/* loaded from: classes.dex */
public final class gy2 extends kjc {
    public static final gy2 G = new gy2(new fy2());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final SparseArray E;
    public final SparseBooleanArray F;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        a82.s(1000, 1001, 1002, 1003, 1004);
        a82.s(1005, 1006, 1007, 1008, 1009);
        a82.s(1010, 1011, 1012, 1013, 1014);
        a2d.K(1015);
        a2d.K(1016);
        a2d.K(1017);
        a2d.K(1018);
    }

    public gy2(fy2 fy2Var) {
        super(fy2Var);
        this.x = fy2Var.x;
        this.y = fy2Var.y;
        this.z = fy2Var.z;
        this.A = fy2Var.A;
        this.B = fy2Var.B;
        this.C = fy2Var.C;
        this.D = fy2Var.D;
        this.E = fy2Var.E;
        this.F = fy2Var.F;
    }

    @Override // defpackage.kjc
    public final jjc a() {
        return new fy2(this);
    }

    @Override // defpackage.kjc
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && gy2.class == obj.getClass()) {
                gy2 gy2Var = (gy2) obj;
                if (super.equals(gy2Var) && this.x == gy2Var.x && this.y == gy2Var.y && this.z == gy2Var.z && this.A == gy2Var.A && this.B == gy2Var.B && this.C == gy2Var.C && this.D == gy2Var.D) {
                    SparseBooleanArray sparseBooleanArray = gy2Var.F;
                    SparseBooleanArray sparseBooleanArray2 = this.F;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                    break;
                                }
                                i++;
                            } else {
                                SparseArray sparseArray = gy2Var.E;
                                SparseArray sparseArray2 = this.E;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                        if (indexOfKey >= 0) {
                                            Map map = (Map) sparseArray2.valueAt(i2);
                                            Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    bjc bjcVar = (bjc) entry.getKey();
                                                    if (map2.containsKey(bjcVar)) {
                                                        if (!Objects.equals(entry.getValue(), map2.get(bjcVar))) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.kjc
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.x ? 1 : 0)) * 961) + (this.y ? 1 : 0)) * 961) + (this.z ? 1 : 0)) * 28629151) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 961) + (this.D ? 1 : 0)) * 31;
    }
}
