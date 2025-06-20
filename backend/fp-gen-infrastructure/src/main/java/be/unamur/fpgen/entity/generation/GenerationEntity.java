package be.unamur.fpgen.entity.generation;

import be.unamur.fpgen.entity.PromptEntity;
import be.unamur.fpgen.entity.author.AuthorEntity;
import be.unamur.fpgen.entity.base.BaseUuidEntity;
import be.unamur.fpgen.message.MessageTopicEnum;
import be.unamur.fpgen.message.MessageTypeEnum;

import javax.persistence.*;
import java.io.Serial;

/**
 * a Generation represent a set of items that are generated by the system
 * it's always composed of a set of elements that are generated by the system
 * those elements can be messages or conversation depending on de generation type
 * A prompt has been used for the generation
 */
@Entity
@Table(name = "generation")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "kind", discriminatorType = DiscriminatorType.STRING)
public class GenerationEntity extends BaseUuidEntity {
    @Serial
    private static final long serialVersionUID = -4712056697432095738L;

    // members
    private String generationId;
    private AuthorEntity author;
    private String details;
    private Integer quantity;
    private MessageTypeEnum type;
    private MessageTopicEnum topic;
    private PromptEntity prompt;

    // getters and setters
    @Column(name = "generation_id", nullable = false)
    public String getGenerationId() {
        return generationId;
    }

    public void setGenerationId(String generationId) {
        this.generationId = generationId;
    }

    @ManyToOne
    @JoinColumn(name = "author_id")
    public AuthorEntity getAuthor() {
        return author;
    }

    public void setAuthor(AuthorEntity author) {
        this.author = author;
    }

    @Column(name = "details")
    public String getDetails() {
        return details;
    }

    public void setDetails(final String details) {
        this.details = details;
    }

    @Column(name = "quantity", nullable = false)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer batch) {
        this.quantity = batch;
    }

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    public MessageTypeEnum getType() {
        return type;
    }

    public void setType(MessageTypeEnum type) {
        this.type = type;
    }

    @Column(name = "topic", nullable = false)
    @Enumerated(EnumType.STRING)
    public MessageTopicEnum getTopic() {
        return topic;
    }

    public void setTopic(MessageTopicEnum topic) {
        this.topic = topic;
    }

    @ManyToOne
    @JoinColumn(name = "prompt_id")
    public PromptEntity getPrompt() {
        return prompt;
    }

    public void setPrompt(PromptEntity prompt) {
        this.prompt = prompt;
    }
}
