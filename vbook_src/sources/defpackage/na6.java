package defpackage;

import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: na6  reason: default package */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class na6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EventType.values().length];
        try {
            iArr[EventType.ENTITY_REF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EventType.START_ELEMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EventType.END_ELEMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EventType.START_DOCUMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EventType.ATTRIBUTE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EventType.IGNORABLE_WHITESPACE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EventType.COMMENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[EventType.TEXT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[EventType.CDSECT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[EventType.DOCDECL.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[EventType.END_DOCUMENT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[EventType.PROCESSING_INSTRUCTION.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr;
        int[] iArr2 = new int[ma6.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused18) {
        }
    }
}
