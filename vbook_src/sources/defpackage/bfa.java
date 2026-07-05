package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bfa  reason: default package */
/* loaded from: classes.dex */
public final class bfa extends hfa {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public bfa(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.hfa
    public final void a(Matrix matrix, tea teaVar, int i, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((hfa) obj).a(this.d, teaVar, i, canvas);
        }
    }
}
