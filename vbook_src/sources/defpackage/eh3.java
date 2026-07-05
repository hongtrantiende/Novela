package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eh3  reason: default package */
/* loaded from: classes.dex */
public final class eh3 implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ eh3(ArrayList arrayList, aw7 aw7Var, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = aw7Var;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                ez5 ez5Var = (ez5) obj;
                if (ez5Var instanceof ch3) {
                    arrayList.add(ez5Var);
                } else if (ez5Var instanceof dh3) {
                    arrayList.remove(((dh3) ez5Var).a);
                }
                aw7Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return pvcVar;
            default:
                ez5 ez5Var2 = (ez5) obj;
                if (ez5Var2 instanceof jm4) {
                    arrayList.add(ez5Var2);
                } else if (ez5Var2 instanceof km4) {
                    arrayList.remove(((km4) ez5Var2).a);
                }
                aw7Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return pvcVar;
        }
    }
}
