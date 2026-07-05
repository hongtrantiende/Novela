package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pu  reason: default package */
/* loaded from: classes.dex */
public final class pu {
    public static final pu a = new Object();

    public final int a(Window window) {
        int i;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i3 = rect.top;
        int i4 = rect.bottom;
        if (i4 > i2) {
            i = i4 - i2;
        } else {
            i = 0;
        }
        return i2 - (i3 + i);
    }
}
