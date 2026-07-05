package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fif  reason: default package */
/* loaded from: classes.dex */
public final class fif implements Map.Entry {
    public final boolean C;
    public Object D;
    public int E;
    public fif a;
    public fif b;
    public fif c;
    public fif d;
    public fif e;
    public final Object f;

    public fif(boolean z, fif fifVar, Object obj, fif fifVar2, fif fifVar3) {
        this.a = fifVar;
        this.f = obj;
        this.C = z;
        this.E = 1;
        this.d = fifVar2;
        this.e = fifVar3;
        fifVar3.d = this;
        fifVar2.e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.D;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.D;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.D;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.C) {
            xk5.k("value == null");
            return null;
        }
        Object obj2 = this.D;
        this.D = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.D);
        return nk2.v(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }

    public fif(boolean z) {
        this.f = null;
        this.C = z;
        this.e = this;
        this.d = this;
    }
}
