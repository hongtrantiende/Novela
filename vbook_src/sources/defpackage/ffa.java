package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ffa  reason: default package */
/* loaded from: classes.dex */
public final class ffa extends gfa {
    public float b;
    public float c;

    @Override // defpackage.gfa
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
