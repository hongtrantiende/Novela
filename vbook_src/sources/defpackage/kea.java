package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kea  reason: default package */
/* loaded from: classes.dex */
public final class kea extends CharacterStyle implements UpdateAppearance {
    public final jea a;
    public final float b;
    public final hm8 c = yae.z(new dna(9205357640488583168L));
    public final h23 d = yae.q(new ak9(this, 15));

    public kea(jea jeaVar, float f) {
        this.a = jeaVar;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        rse.j(textPaint, this.b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
