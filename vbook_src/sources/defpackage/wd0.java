package defpackage;

import android.view.View;
import android.view.autofill.AutofillManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wd0  reason: default package */
/* loaded from: classes.dex */
public abstract class wd0 {
    public static void a(View view, AutofillManager autofillManager, int i, boolean z) {
        autofillManager.notifyViewVisibilityChanged(view, i, z);
    }
}
