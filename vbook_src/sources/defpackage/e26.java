package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e26  reason: default package */
/* loaded from: classes.dex */
public final class e26 implements Iterator {
    public static final e26 a;
    public static final /* synthetic */ e26[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e26] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new e26[]{r0};
    }

    public static e26 valueOf(String str) {
        return (e26) Enum.valueOf(e26.class, str);
    }

    public static e26[] values() {
        return (e26[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        wq9.C("no calls to next() since the last call to remove()", false);
    }
}
