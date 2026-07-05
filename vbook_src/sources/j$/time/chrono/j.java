package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public interface j extends Comparable {
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static j$.time.chrono.j of(java.lang.String r4) {
        /*
            java.util.concurrent.ConcurrentHashMap r0 = j$.time.chrono.a.a
            java.lang.String r0 = "id"
            java.util.Objects.requireNonNull(r4, r0)
        L7:
            java.util.concurrent.ConcurrentHashMap r0 = j$.time.chrono.a.a
            java.lang.Object r1 = r0.get(r4)
            j$.time.chrono.j r1 = (j$.time.chrono.j) r1
            if (r1 != 0) goto L19
            java.util.concurrent.ConcurrentHashMap r1 = j$.time.chrono.a.b
            java.lang.Object r1 = r1.get(r4)
            j$.time.chrono.j r1 = (j$.time.chrono.j) r1
        L19:
            if (r1 == 0) goto L1c
            return r1
        L1c:
            java.lang.String r1 = "ISO"
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L8b
            j$.time.chrono.m r0 = j$.time.chrono.m.l
            r0.getClass()
            java.lang.String r2 = "Hijrah-umalqura"
            j$.time.chrono.a.A(r0, r2)
            j$.time.chrono.t r0 = j$.time.chrono.t.c
            r0.getClass()
            java.lang.String r2 = "Japanese"
            j$.time.chrono.a.A(r0, r2)
            j$.time.chrono.y r0 = j$.time.chrono.y.c
            r0.getClass()
            java.lang.String r2 = "Minguo"
            j$.time.chrono.a.A(r0, r2)
            j$.time.chrono.e0 r0 = j$.time.chrono.e0.c
            r0.getClass()
            java.lang.String r2 = "ThaiBuddhist"
            j$.time.chrono.a.A(r0, r2)
            java.lang.Class<j$.time.chrono.a> r0 = j$.time.chrono.a.class
            r0 = 0
            j$.time.chrono.a[] r0 = new j$.time.chrono.a[r0]     // Catch: java.lang.Throwable -> L80
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L80
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L80
        L59:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L77
            java.lang.Object r2 = r0.next()
            j$.time.chrono.a r2 = (j$.time.chrono.a) r2
            java.lang.String r3 = r2.p()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L59
            java.lang.String r3 = r2.p()
            j$.time.chrono.a.A(r2, r3)
            goto L59
        L77:
            j$.time.chrono.q r0 = j$.time.chrono.q.c
            r0.getClass()
            j$.time.chrono.a.A(r0, r1)
            goto L7
        L80:
            r4 = move-exception
            java.util.ServiceConfigurationError r0 = new java.util.ServiceConfigurationError
            java.lang.String r1 = r4.getMessage()
            r0.<init>(r1, r4)
            throw r0
        L8b:
            java.lang.Class<j$.time.chrono.j> r0 = j$.time.chrono.j.class
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0)
            java.util.Iterator r0 = r0.iterator()
        L95:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = r0.next()
            j$.time.chrono.j r1 = (j$.time.chrono.j) r1
            java.lang.String r2 = r1.p()
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto Lb5
            java.lang.String r2 = r1.s()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L95
        Lb5:
            return r1
        Lb6:
            java.lang.String r0 = "Unknown chronology: "
            java.lang.String r4 = r0.concat(r4)
            j$.time.e.a(r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.j.of(java.lang.String):j$.time.chrono.j");
    }

    static j q(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        j jVar = (j) temporalAccessor.d(j$.time.temporal.p.b);
        q qVar = q.c;
        if (jVar != null) {
            return jVar;
        }
        Objects.requireNonNull(qVar, "defaultObj");
        return qVar;
    }

    k B(int i);

    int C(k kVar, int i);

    ChronoLocalDate G(TemporalAccessor temporalAccessor);

    default ChronoLocalDateTime H(LocalDateTime localDateTime) {
        try {
            return G(localDateTime).K(LocalTime.A(localDateTime));
        } catch (DateTimeException e) {
            throw new RuntimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }

    ChronoLocalDate L();

    ChronoLocalDate O(int i, int i2, int i3);

    ChronoLocalDate Q(Map map, j$.time.format.d0 d0Var);

    ChronoZonedDateTime R(Instant instant, ZoneId zoneId);

    boolean U(long j);

    boolean equals(Object obj);

    int hashCode();

    ChronoLocalDate o(long j);

    String p();

    String s();

    ChronoLocalDate t(int i, int i2);

    String toString();

    j$.time.temporal.s y(ChronoField chronoField);

    List z();
}
