package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m81  reason: default package */
/* loaded from: classes3.dex */
public final class m81 extends b3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p81 b;

    public /* synthetic */ m81(p81 p81Var, int i) {
        this.a = i;
        this.b = p81Var;
    }

    @Override // defpackage.b3
    public final int a() {
        int i = this.a;
        p81 p81Var = this.b;
        switch (i) {
            case 0:
                return p81Var.c;
            default:
                return p81Var.c;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException("CaseInsensitiveMap.entries does not support add");
            default:
                ((String) obj).getClass();
                throw new UnsupportedOperationException("CaseInsensitiveMap.keys does not support add");
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!jsc.H(obj)) {
                    return false;
                }
                return super.contains((Map.Entry) obj);
            default:
                if (!(obj instanceof String)) {
                    return false;
                }
                return this.b.containsKey((String) obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        p81 p81Var = this.b;
        switch (i) {
            case 0:
                return new l81(p81Var, 0);
            default:
                return new l81(p81Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!jsc.H(obj)) {
                    return false;
                }
                return super.remove((Map.Entry) obj);
            default:
                if (!(obj instanceof String)) {
                    return false;
                }
                if (this.b.remove((String) obj) == null) {
                    return false;
                }
                return true;
        }
    }
}
