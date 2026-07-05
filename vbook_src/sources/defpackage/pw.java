package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pw  reason: default package */
/* loaded from: classes.dex */
public abstract class pw {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) qw.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
