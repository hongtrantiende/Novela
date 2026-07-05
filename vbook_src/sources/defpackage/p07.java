package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p07  reason: default package */
/* loaded from: classes3.dex */
public final class p07 implements Map.Entry, m76 {
    public final r07 a;
    public final int b;
    public final int c;

    public p07(r07 r07Var, int i) {
        r07Var.getClass();
        this.a = r07Var;
        this.b = i;
        this.c = r07Var.D;
    }

    public final void a() {
        if (this.a.D == this.c) {
            return;
        }
        throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (c16.i(entry.getKey(), getKey()) && c16.i(entry.getValue(), getValue())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.a.a[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.a.b;
        objArr.getClass();
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i;
        Object key = getKey();
        int i2 = 0;
        if (key != null) {
            i = key.hashCode();
        } else {
            i = 0;
        }
        Object value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        r07 r07Var = this.a;
        r07Var.c();
        Object[] objArr = r07Var.b;
        if (objArr == null) {
            int length = r07Var.a.length;
            if (length >= 0) {
                objArr = new Object[length];
                r07Var.b = objArr;
            } else {
                vs.m("capacity must be non-negative.");
                return null;
            }
        }
        int i = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
