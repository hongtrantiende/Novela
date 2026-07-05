package defpackage;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uff  reason: default package */
/* loaded from: classes.dex */
public abstract class uff {
    public final Object fromJson(Reader reader) {
        return read(new tyd(reader));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [akf, tyd] */
    public final Object fromJsonTree(tef tefVar) {
        try {
            ?? tydVar = new tyd(akf.N);
            tydVar.J = new Object[32];
            tydVar.K = 0;
            tydVar.L = new String[32];
            tydVar.M = new int[32];
            tydVar.q1(tefVar);
            return read(tydVar);
        } catch (IOException e) {
            throw new gt1(16, e);
        }
    }

    public final uff nullSafe() {
        if (!(this instanceof rff)) {
            return new rff(this);
        }
        return this;
    }

    public abstract Object read(tyd tydVar);

    public final String toJson(Object obj) {
        StringBuilder sb = new StringBuilder();
        try {
            toJson(new iw6(sb), obj);
            return sb.toString();
        } catch (IOException e) {
            throw new gt1(16, e);
        }
    }

    public final tef toJsonTree(Object obj) {
        try {
            ekf ekfVar = new ekf();
            write(ekfVar, obj);
            ArrayList arrayList = ekfVar.I;
            if (arrayList.isEmpty()) {
                return ekfVar.K;
            }
            throw new IllegalStateException("Expected one JSON element but was ".concat(arrayList.toString()));
        } catch (IOException e) {
            throw new gt1(16, e);
        }
    }

    public abstract void write(uyd uydVar, Object obj);

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final void toJson(Writer writer, Object obj) {
        write(new uyd(writer), obj);
    }
}
