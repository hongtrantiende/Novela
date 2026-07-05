package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalDate;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lt6  reason: default package */
/* loaded from: classes3.dex */
public final class lt6 {
    public static nt6 a(long j) {
        try {
            LocalDate ofEpochDay = LocalDate.ofEpochDay(j);
            ofEpochDay.getClass();
            return new nt6(ofEpochDay);
        } catch (DateTimeException e) {
            xk5.m(e);
            return null;
        }
    }

    public final s76 serializer() {
        return ut6.a;
    }
}
