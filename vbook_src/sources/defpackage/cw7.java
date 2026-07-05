package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cw7  reason: default package */
/* loaded from: classes.dex */
public final class cw7 implements s76 {
    public final /* synthetic */ int a;
    public final s76 b;
    public final o9a c;

    public cw7(s76 s76Var, int i) {
        o9a i2;
        this.a = i;
        s76Var.getClass();
        switch (i) {
            case 1:
                s76 serializer = ewa.Companion.serializer(s76Var);
                this.b = serializer;
                this.c = serializer.e();
                return;
            default:
                this.b = s76Var;
                bze e = s76Var.e().e();
                if (e instanceof w59) {
                    i2 = aze.e("kotlinx.coroutines.flow.MutableStateFlow", (w59) e);
                } else {
                    i2 = aze.i("kotlinx.coroutines.flow.MutableStateFlow", s76Var.e());
                }
                this.c = i2;
                return;
        }
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        int i = this.a;
        s76 s76Var = this.b;
        switch (i) {
            case 0:
                bw7 bw7Var = (bw7) obj;
                bw7Var.getClass();
                jbeVar.G(s76Var, ((cza) bw7Var).getValue());
                return;
            default:
                SparseArray sparseArray = (SparseArray) obj;
                sparseArray.getClass();
                int size = sparseArray.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(Integer.valueOf(sparseArray.keyAt(i2)));
                }
                int size2 = sparseArray.size();
                ArrayList arrayList2 = new ArrayList(size2);
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList2.add(sparseArray.valueAt(i3));
                }
                jbeVar.G(s76Var, new ewa(arrayList, arrayList2));
                return;
        }
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        int i = this.a;
        s76 s76Var = this.b;
        switch (i) {
            case 0:
                return dza.a(yq2Var.d(s76Var));
            default:
                ewa ewaVar = (ewa) yq2Var.d(s76Var);
                List list = ewaVar.a;
                int size = list.size();
                List list2 = ewaVar.b;
                if (size == list2.size()) {
                    SparseArray sparseArray = new SparseArray(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        sparseArray.append(((Number) list.get(i2)).intValue(), list2.get(i2));
                    }
                    return sparseArray;
                }
                vs.m("Failed requirement.");
                return null;
        }
    }

    @Override // defpackage.s76
    public final o9a e() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }
}
