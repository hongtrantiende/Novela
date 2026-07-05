package defpackage;

import android.media.ImageReader;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lc6  reason: default package */
/* loaded from: classes.dex */
public final class lc6 implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ f61 a;

    public lc6(f61 f61Var) {
        this.a = f61Var;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        this.a.resumeWith(imageReader.acquireLatestImage());
    }
}
