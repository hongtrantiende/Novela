package defpackage;

import android.graphics.RuntimeShader;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ws0  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ws0 {
    public static /* synthetic */ RuntimeShader a(String str) {
        return new RuntimeShader(str);
    }

    public static /* synthetic */ BoringLayout b(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, nae.e, metrics, z, truncateAt, i2, true);
    }
}
