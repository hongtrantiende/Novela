package j$.time.format;

import j$.time.temporal.TemporalField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class a extends a0 {
    public final /* synthetic */ z d;

    public a(z zVar) {
        this.d = zVar;
    }

    @Override // j$.time.format.a0
    public final String b(j$.time.chrono.j jVar, TemporalField temporalField, long j, e0 e0Var, Locale locale) {
        return this.d.a(j, e0Var);
    }

    @Override // j$.time.format.a0
    public final String c(TemporalField temporalField, long j, e0 e0Var, Locale locale) {
        return this.d.a(j, e0Var);
    }

    @Override // j$.time.format.a0
    public final Iterator d(j$.time.chrono.j jVar, TemporalField temporalField, e0 e0Var, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(e0Var);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.a0
    public final Iterator e(TemporalField temporalField, e0 e0Var, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(e0Var);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
