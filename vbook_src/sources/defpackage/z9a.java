package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z9a  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class z9a implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ z9a(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int size;
        int i = this.a;
        int i2 = 0;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                return ((t76) arrayList.get(0)).e();
            default:
                if (arrayList.isEmpty()) {
                    return ks3.a;
                }
                if (((CharSequence) sl1.c0(arrayList)).length() == 0 && arrayList.size() > 1) {
                    i2 = 1;
                }
                if (((CharSequence) sl1.j0(arrayList)).length() == 0) {
                    size = arrayList.size() - 1;
                } else {
                    size = arrayList.size();
                }
                return arrayList.subList(i2, size);
        }
    }
}
