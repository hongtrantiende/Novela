package defpackage;

import android.text.Editable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gq3  reason: default package */
/* loaded from: classes.dex */
public final class gq3 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile gq3 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls != null) {
            return new xva(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
