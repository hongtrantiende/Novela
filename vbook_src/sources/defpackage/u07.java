package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u07  reason: default package */
/* loaded from: classes.dex */
public class u07 implements Map.Entry, j76 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public u07(String str, List list) {
        this.a = 2;
        str.getClass();
        list.getClass();
        this.b = str;
        this.c = list;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    entry = (Map.Entry) obj;
                } else {
                    entry = null;
                }
                if (entry == null || !c16.i(entry.getKey(), obj2) || !c16.i(entry.getValue(), getValue())) {
                    return false;
                }
                return true;
            case 1:
            default:
                return super.equals(obj);
            case 2:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (!c16.i(entry2.getKey(), (String) obj2) || !c16.i(entry2.getValue(), (List) this.c)) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            default:
                return (String) this.b;
        }
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.a) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            default:
                return (List) this.c;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                int i3 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object value = getValue();
                if (value != null) {
                    i3 = value.hashCode();
                }
                return i ^ i3;
            case 1:
            default:
                return super.hashCode();
            case 2:
                return ((List) this.c).hashCode() ^ ((String) obj).hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object value = getValue();
                return obj + "=" + value;
            case 1:
            default:
                return super.toString();
            case 2:
                return ((String) obj) + '=' + ((List) this.c);
        }
    }

    public /* synthetic */ u07(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
