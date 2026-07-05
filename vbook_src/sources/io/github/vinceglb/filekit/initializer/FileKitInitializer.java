package io.github.vinceglb.filekit.initializer;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class FileKitInitializer implements gv5 {
    @Override // defpackage.gv5
    public final List a() {
        return ks3.a;
    }

    @Override // defpackage.gv5
    public final Object b(Context context) {
        context.getClass();
        cne cneVar = cne.e;
        WeakReference weakReference = dd4.a;
        dd4.a = new WeakReference(context);
        return cneVar;
    }
}
