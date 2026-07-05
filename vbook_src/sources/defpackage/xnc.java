package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xnc  reason: default package */
/* loaded from: classes3.dex */
public final class xnc implements a63 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    @Override // defpackage.a63
    public final Object a(CharSequence charSequence, String str) {
        charSequence.getClass();
        return e(charSequence, 0, charSequence.length(), str);
    }

    @Override // defpackage.a63
    public final Object b(int i, int i2, String str) {
        str.getClass();
        return d(i, i2 + i, str);
    }

    @Override // defpackage.a63
    public final Object c(CharSequence charSequence) {
        charSequence.getClass();
        return f(0, charSequence.length(), charSequence);
    }

    @Override // defpackage.a63
    public final void clear() {
        this.a.clear();
        this.b.clear();
    }

    public final Object d(int i, int i2, CharSequence charSequence) {
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(i);
            if (i == i2 - 1) {
                return this.a.get(Character.valueOf(charAt));
            }
            xnc xncVar = (xnc) this.b.get(Character.valueOf(charAt));
            if (xncVar == null) {
                return null;
            }
            return xncVar.d(i + 1, i2, charSequence);
        }
        throw null;
    }

    public final Object e(CharSequence charSequence, int i, int i2, Object obj) {
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(i);
            if (i == i2 - 1) {
                return this.a.put(Character.valueOf(charAt), obj);
            }
            Character valueOf = Character.valueOf(charAt);
            HashMap hashMap = this.b;
            xnc xncVar = (xnc) hashMap.get(valueOf);
            if (xncVar == null) {
                xncVar = new xnc();
                hashMap.put(Character.valueOf(charAt), xncVar);
            }
            return xncVar.e(charSequence, i + 1, i2, obj);
        }
        throw null;
    }

    public final Object f(int i, int i2, CharSequence charSequence) {
        char charAt = charSequence.charAt(i);
        if (i == i2 - 1) {
            return this.a.remove(Character.valueOf(charAt));
        }
        xnc xncVar = (xnc) this.b.get(Character.valueOf(charAt));
        if (xncVar != null) {
            return xncVar.f(i + 1, i2, charSequence);
        }
        return null;
    }

    @Override // defpackage.a63
    public final int size() {
        return this.b.size();
    }
}
