package defpackage;

import java.text.BreakIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h15  reason: default package */
/* loaded from: classes.dex */
public final class h15 extends lpe {
    public final BreakIterator e;

    public h15(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.e = characterInstance;
    }

    @Override // defpackage.lpe
    public final int u(int i) {
        return this.e.following(i);
    }

    @Override // defpackage.lpe
    public final int v(int i) {
        return this.e.preceding(i);
    }
}
