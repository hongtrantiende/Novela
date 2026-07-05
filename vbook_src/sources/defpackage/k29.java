package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k29  reason: default package */
/* loaded from: classes.dex */
public final class k29 extends j29 {
    @Override // defpackage.h88
    public final void p(View view, Rect rect) {
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
