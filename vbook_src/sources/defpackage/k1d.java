package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k1d  reason: default package */
/* loaded from: classes3.dex */
public abstract class k1d {
    public static final mfb a = new mfb(new tvc(15));
    public static final mfb b = new mfb(new tvc(16));
    public static final mfb c = new mfb(new tvc(17));

    public static final f1d a(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new f1d((ZoneOffset) dateTimeFormatter.parse(str, new Object()));
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
