package defpackage;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w04  reason: default package */
/* loaded from: classes.dex */
public final class w04 extends ly2 {
    public final /* synthetic */ x04 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w04(Context context, x04 x04Var) {
        super(context);
        this.l = x04Var;
    }

    @Override // defpackage.ly2
    public final Pair m(m17 m17Var, int[][][] iArr, gy2 gy2Var, String str) {
        m17 m17Var2 = m17Var;
        gy2Var.getClass();
        p8b p8bVar = (p8b) ((cza) ((s26) this.l.H.a).b).getValue();
        if (p8bVar == null) {
            return super.m(m17Var, iArr, gy2Var, str);
        }
        int i = m17Var2.a;
        int i2 = 0;
        while (i2 < i) {
            if (3 == m17Var2.b[i2]) {
                bjc bjcVar = m17Var2.c[i2];
                bjcVar.getClass();
                int i3 = bjcVar.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    ajc a = bjcVar.a(i4);
                    int i5 = a.a;
                    String str2 = p8bVar.a;
                    ArrayList arrayList = p8bVar.b;
                    if (!c16.i(str2, a.b)) {
                        if (!arrayList.isEmpty()) {
                            for (int i6 = 0; i6 < i5; i6++) {
                                vq4 vq4Var = a.d[i6];
                                vq4Var.getClass();
                                qs5 qs5Var = vq4Var.c;
                                if (!qs5Var.isEmpty() && !arrayList.isEmpty()) {
                                    int size = arrayList.size();
                                    int i7 = 0;
                                    while (i7 < size) {
                                        Object obj = arrayList.get(i7);
                                        i7++;
                                        if (c16.i(((djc) obj).a, ((za6) sl1.c0(qs5Var)).b)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int[] iArr2 = new int[i5];
                    for (int i8 = 0; i8 < i5; i8++) {
                        iArr2[i8] = i8;
                    }
                    return new Pair(new b14(0, a, iArr2), Integer.valueOf(i2));
                }
                continue;
            }
            i2++;
            m17Var2 = m17Var;
        }
        return super.m(m17Var, iArr, gy2Var, str);
    }
}
