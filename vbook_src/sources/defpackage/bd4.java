package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bd4  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd4 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ aw7 e;

    public /* synthetic */ bd4(aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = aw7Var2;
        this.d = aw7Var3;
        this.e = aw7Var4;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = null;
        aw7 aw7Var = this.e;
        aw7 aw7Var2 = this.d;
        aw7 aw7Var3 = this.c;
        aw7 aw7Var4 = this.b;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    list = tl1.A(fpe.k(uri));
                }
                zr1.z(this.b, this.c, this.d, this.e, "visual_single", list);
                return pvcVar;
            case 1:
                List<Uri> list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList = new ArrayList(tl1.s(list2, 10));
                for (Uri uri2 : list2) {
                    arrayList.add(fpe.k(uri2));
                }
                zr1.z(this.b, this.c, this.d, this.e, "visual_multiple", arrayList);
                return pvcVar;
            case 2:
                Uri uri3 = (Uri) obj;
                if (uri3 != null) {
                    list = tl1.A(fpe.k(uri3));
                }
                zr1.z(this.b, this.c, this.d, this.e, "file_single", list);
                return pvcVar;
            case 3:
                List<Uri> list3 = (List) obj;
                list3.getClass();
                ArrayList arrayList2 = new ArrayList(tl1.s(list3, 10));
                for (Uri uri4 : list3) {
                    arrayList2.add(fpe.k(uri4));
                }
                zr1.z(this.b, this.c, this.d, this.e, "file_multiple", arrayList2);
                return pvcVar;
            case 4:
                ((nu4) aw7Var4.getValue()).h(Integer.valueOf((int) ((Float) obj).floatValue()), Integer.valueOf(((Number) aw7Var3.getValue()).intValue()), Integer.valueOf(((Number) aw7Var2.getValue()).intValue()), Integer.valueOf(((Number) aw7Var.getValue()).intValue()));
                return pvcVar;
            case 5:
                ((nu4) aw7Var4.getValue()).h(Integer.valueOf(((Number) aw7Var3.getValue()).intValue()), Integer.valueOf(((Number) aw7Var2.getValue()).intValue()), Integer.valueOf((int) ((Float) obj).floatValue()), Integer.valueOf(((Number) aw7Var.getValue()).intValue()));
                return pvcVar;
            case 6:
                ((nu4) aw7Var4.getValue()).h(Integer.valueOf(((Number) aw7Var3.getValue()).intValue()), Integer.valueOf((int) ((Float) obj).floatValue()), Integer.valueOf(((Number) aw7Var2.getValue()).intValue()), Integer.valueOf(((Number) aw7Var.getValue()).intValue()));
                return pvcVar;
            default:
                ((nu4) aw7Var4.getValue()).h(Integer.valueOf(((Number) aw7Var3.getValue()).intValue()), Integer.valueOf(((Number) aw7Var2.getValue()).intValue()), Integer.valueOf(((Number) aw7Var.getValue()).intValue()), Integer.valueOf((int) ((Float) obj).floatValue()));
                return pvcVar;
        }
    }
}
