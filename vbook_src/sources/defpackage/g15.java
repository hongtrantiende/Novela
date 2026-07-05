package defpackage;

import android.text.TextPaint;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g15  reason: default package */
/* loaded from: classes.dex */
public final class g15 extends lpe {
    public final CharSequence e;
    public final TextPaint f;

    public g15(CharSequence charSequence, TextPaint textPaint) {
        this.e = charSequence;
        this.f = textPaint;
    }

    @Override // defpackage.lpe
    public final int u(int i) {
        CharSequence charSequence = this.e;
        return this.f.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.lpe
    public final int v(int i) {
        CharSequence charSequence = this.e;
        return this.f.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
