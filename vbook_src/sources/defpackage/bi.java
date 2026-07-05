package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bi  reason: default package */
/* loaded from: classes.dex */
public final class bi extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi(int i, ArrayList arrayList) {
        super(1);
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                lw8 lw8Var = (lw8) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    lw8.z(lw8Var, (mw8) arrayList.get(i2), 0, 0);
                }
                return pvcVar;
            case 1:
                lw8 lw8Var2 = (lw8) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        lw8.z(lw8Var2, (mw8) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                return pvcVar;
            case 2:
                lw8 lw8Var3 = (lw8) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    lw8Var3.o((mw8) arrayList.get(i4), 0, 0, nae.e);
                }
                return pvcVar;
            default:
                lw8 lw8Var4 = (lw8) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    lw8.E(lw8Var4, (mw8) arrayList.get(i5), 0, 0, null, 12);
                }
                return pvcVar;
        }
    }
}
