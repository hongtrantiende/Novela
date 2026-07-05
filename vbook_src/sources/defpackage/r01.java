package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r01  reason: default package */
/* loaded from: classes3.dex */
public final class r01 extends ow2 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r01(int i, int i2) {
        super(i);
        this.f = i2;
    }

    @Override // defpackage.ow2
    public Object o(Object obj) {
        int i = 0;
        switch (this.f) {
            case 2:
                q45 q45Var = (q45) obj;
                ArrayList arrayList = q45Var.a;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ng5.a.R0((int[]) obj2);
                }
                arrayList.clear();
                return q45Var;
            case 3:
                int[] iArr = (int[]) obj;
                b00.h0(-1, 0, 6, iArr);
                return iArr;
            default:
                return obj;
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [q45, java.lang.Object] */
    @Override // defpackage.ow2
    public final Object q() {
        switch (this.f) {
            case 0:
                return new byte[4096];
            case 1:
                return new char[2048];
            case 2:
                ?? obj = new Object();
                obj.a = new ArrayList();
                return obj;
            default:
                int[] iArr = new int[768];
                for (int i = 0; i < 768; i++) {
                    iArr[i] = -1;
                }
                return iArr;
        }
    }
}
