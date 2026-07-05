package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dg6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dg6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ dg6(aw7 aw7Var, ArrayList arrayList, List list, boolean z, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = arrayList;
        this.d = list;
        this.e = z;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.e;
        List list = this.d;
        ArrayList arrayList = this.c;
        aw7 aw7Var = this.b;
        pvc pvcVar = pvc.a;
        lw8 lw8Var = (lw8) obj;
        switch (i) {
            case 0:
                lw8Var.a = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((fg6) arrayList.get(i2)).n(lw8Var, z);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((fg6) list.get(i3)).n(lw8Var, z);
                }
                lw8Var.a = false;
                aw7Var.getValue();
                return pvcVar;
            default:
                lw8Var.a = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((gj6) arrayList.get(i4)).n(lw8Var, z);
                }
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((gj6) list.get(i5)).n(lw8Var, z);
                }
                lw8Var.a = false;
                aw7Var.getValue();
                return pvcVar;
        }
    }
}
