package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qza  reason: default package */
/* loaded from: classes.dex */
public final class qza implements wq2 {
    public final q8a a;

    public qza(q8a q8aVar) {
        this.a = q8aVar;
    }

    @Override // defpackage.wq2
    public final xq2 a(xta xtaVar, xe8 xe8Var) {
        ImageDecoder.Source E;
        Bitmap.Config b = op5.b(xe8Var);
        if ((b != Bitmap.Config.ARGB_8888 && b != Bitmap.Config.HARDWARE) || (E = ff.E(xtaVar.a, xe8Var, false)) == null) {
            return null;
        }
        return new sza(E, xtaVar.a, xe8Var, this.a);
    }
}
