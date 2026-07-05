package defpackage;

import android.view.View;
import android.view.WindowInsets;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: icd  reason: default package */
/* loaded from: classes.dex */
public abstract class icd {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = xcd.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
