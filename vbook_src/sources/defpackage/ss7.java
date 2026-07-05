package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ss7  reason: default package */
/* loaded from: classes.dex */
public final class ss7 extends ny0 {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public ss7(int i, long j) {
        super(i, 2);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final ss7 n(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ss7 ss7Var = (ss7) arrayList.get(i2);
            if (ss7Var.b == i) {
                return ss7Var;
            }
        }
        return null;
    }

    public final ts7 o(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ts7 ts7Var = (ts7) arrayList.get(i2);
            if (ts7Var.b == i) {
                return ts7Var;
            }
        }
        return null;
    }

    @Override // defpackage.ny0
    public final String toString() {
        return ny0.e(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
