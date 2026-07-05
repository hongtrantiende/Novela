package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n81  reason: default package */
/* loaded from: classes3.dex */
public final class n81 implements Map.Entry, m76 {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;
    public final /* synthetic */ j76 d;

    public n81(hza hzaVar) {
        this.d = hzaVar;
        Map.Entry entry = (Map.Entry) hzaVar.c;
        entry.getClass();
        this.b = entry.getKey();
        Map.Entry entry2 = (Map.Entry) hzaVar.c;
        entry2.getClass();
        this.c = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (((String) this.c).equals(entry.getKey()) && this.b.equals(entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.a) {
            case 0:
                return (String) this.c;
            default:
                return this.b;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.c;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.a) {
            case 0:
                return this.b.hashCode() ^ ((String) this.c).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = this.a;
        j76 j76Var = this.d;
        switch (i) {
            case 0:
                obj.getClass();
                Object obj2 = this.b;
                this.b = obj;
                p81 p81Var = (p81) j76Var;
                int a = p81Var.a((String) this.c);
                if (a >= 0) {
                    p81Var.b[a] = obj;
                }
                return obj2;
            default:
                hza hzaVar = (hza) j76Var;
                qra qraVar = (qra) hzaVar.d;
                if (qraVar.d().d == hzaVar.b) {
                    Object obj3 = this.c;
                    qraVar.put(this.b, obj);
                    this.c = obj;
                    return obj3;
                }
                vs.f();
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((String) this.c) + '=' + this.b;
            default:
                return super.toString();
        }
    }

    public n81(p81 p81Var, String str, Object obj) {
        this.d = p81Var;
        this.c = str;
        this.b = obj;
    }
}
