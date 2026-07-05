package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qu8  reason: default package */
/* loaded from: classes3.dex */
public final class qu8 {
    public static final ArrayList e = new ArrayList();
    public final lie a;
    public final pc2 b;
    public List c;
    public boolean d;

    public qu8(lie lieVar, pc2 pc2Var) {
        lieVar.getClass();
        ArrayList arrayList = e;
        arrayList.getClass();
        if ((arrayList instanceof j76) && !(arrayList instanceof l76)) {
            jsc.K(arrayList, "kotlin.collections.MutableList");
            throw null;
        }
        this.a = lieVar;
        this.b = pc2Var;
        this.c = arrayList;
        this.d = true;
        if (arrayList.isEmpty()) {
            return;
        }
        vs.k("The shared empty array list has been modified");
        throw null;
    }

    public final String toString() {
        return "Phase `" + this.a.b + "`, " + this.c.size() + " handlers";
    }
}
