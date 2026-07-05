package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jp3  reason: default package */
/* loaded from: classes.dex */
public final class jp3 {
    public final boolean a;
    public final int b;
    public final int c;

    static {
        Math.round(5.1000000000000005d);
    }

    public jp3(Context context) {
        TypedValue typedValue = new TypedValue();
        boolean z = true;
        typedValue = context.getTheme().resolveAttribute(R.attr.elevationOverlayEnabled, typedValue, true) ? typedValue : null;
        z = (typedValue == null || typedValue.type != 18 || typedValue.data == 0) ? false : z;
        int t = xxe.t(context, R.attr.elevationOverlayColor);
        xxe.t(context, R.attr.elevationOverlayAccentColor);
        int t2 = xxe.t(context, R.attr.colorSurface);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = z;
        this.b = t;
        this.c = t2;
    }
}
