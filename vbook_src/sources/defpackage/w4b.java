package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w4b  reason: default package */
/* loaded from: classes.dex */
public final class w4b extends z4b {
    public final ArrayList d;
    public int e;

    public w4b(ex3 ex3Var) {
        super(ex3Var);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = 2;
        arrayList.add(ex3Var);
        this.e = ex3Var.a() + this.e;
    }

    @Override // defpackage.ex3
    public final int a() {
        return this.e;
    }

    @Override // defpackage.z4b, defpackage.ex3
    public final void e() {
        Iterator it = this.d.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ((ex3) next).e();
        }
        super.e();
    }

    @Override // defpackage.z4b
    public final boolean g(cp3 cp3Var, y28 y28Var) {
        cp3Var.getClass();
        y28Var.getClass();
        if (y28Var != cp3Var) {
            ArrayList arrayList = this.d;
            int size = arrayList.size() - 1;
            if (size < 0) {
                return true;
            }
            while (true) {
                int i = size - 1;
                if (y28Var != null) {
                    Object obj = arrayList.get(size);
                    obj.getClass();
                    if (!((ex3) obj).d(cp3Var, y28Var)) {
                        return false;
                    }
                    y28Var = y28Var.A();
                    if (i >= 0) {
                        size = i;
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    public final String toString() {
        String[] strArr = d4b.a;
        return d4b.j(" > ", this.d);
    }
}
